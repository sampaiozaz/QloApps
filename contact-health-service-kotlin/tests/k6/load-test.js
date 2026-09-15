import http from 'k6/http';
import { check, sleep } from 'k6';

export const options = {
  stages: [
    { duration: '5s', target: 20 },  // Ramp-up to 20 virtual users
    { duration: '10s', target: 50 }, // Sustained load at 50 virtual users
    { duration: '5s', target: 0 },   // Ramp-down
  ],
  thresholds: {
    http_req_duration: ['p(95)<600'], // SLA constraint: 95% of requests must complete under 600ms
    http_req_failed: ['rate<0.01'],    // Error rate must be under 1%
  },
};

export default function () {
  const url = 'http://127.0.0.1:8103/v1/contact-evaluations';
  const payload = JSON.stringify({
    customer_id: 'cust-1042',
    email: 'marina.costa@tech.com',
    phone: '+5511991234567',
    last_verified_at: '2026-08-20T10:00:00Z',
    consent_expires_at: '2027-01-01T00:00:00Z',
    reference_date: '2026-08-27'
  });

  const params = {
    headers: {
      'Content-Type': 'application/json',
      'X-Correlation-ID': '7a8b9c0d-1e2f-4a5b-8c6d-7e8f9a0b1c2d',
    },
  };

  const res = http.post(url, payload, params);

  check(res, {
    'status is 200': (r) => r.status === 200,
    'response has correlation_id': (r) => r.body.includes('correlation_id'),
    'response has hygiene_score': (r) => r.body.includes('hygiene_score'),
  });

  sleep(0.1);
}
