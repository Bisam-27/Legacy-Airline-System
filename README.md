# Software Re-Engineering (SRE) Project

This repository contains the codebase, analysis configuration, database models, and ETL scripts for the SRE refactoring and migration assignment.

## Repository Contents
* `/legacy-airline-system/` - The original Java project exhibiting code smells (Large Class, Long Method, Feature Envy).
* `sonar-project.properties` - Configuration for SonarScanner technical debt analysis.
* `/prisma-hospital-db/` - Contains the normalized database schema, mock dataset, and migration scripts.
* `migration_etl.py` - The Python ETL script implementing T1-T4 transformations to migrate legacy data into the 3NF schema.

---

## Setup & Execution Instructions

### 1. Start SonarQube Server
We use Docker to spin up a local instance of SonarQube for static code analysis. Run the following command:
```bash
docker run -d --name sonarqube -p 9000:9000 sonarqube:latest
