package com.hotel.contacthealth.domain

import com.tngtech.archunit.core.importer.ClassFileImporter
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

@DisplayName("Clean Architecture Rule Verification")
class CleanArchitectureTest {

    @Test
    @DisplayName("Domain layer classes must not depend on Ktor framework or outer infrastructure")
    fun domainClassesShouldNotDependOnKtorOrInfrastructure() {
        val importedClasses = ClassFileImporter().importPackages("com.hotel.contacthealth.domain..")

        val rule = noClasses()
            .that()
            .resideInAPackage("..domain..")
            .should()
            .dependOnClassesThat()
            .resideInAPackage("io.ktor..")

        rule.check(importedClasses)
    }
}
