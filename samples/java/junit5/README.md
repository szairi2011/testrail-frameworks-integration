# JUnit5 sample project

## How to use the project

- Replace the placeholders in `trcli-config.yml` with your TestRail instance details
- Execute the commands on the script below

```sh
# Install TR CLI
pip install trcli

# Install test project
mvn clean compile

# Run tests
mvn clean compile test

# Upload test results
trcli -y -c "trcli-config.yml" parse_junit -f "./target/TEST-junit-jupiter.xml"

```

In case you want to run the project using docker instead, you can use the script below.
```sh
# Install TR CLI
pip install trcli

# Execute tests project in docker
docker run -it -v ${PWD}:/usr/src/junit5 -w "/usr/src/junit5" maven:3.6.3-jdk-11-openj9 mvn clean compile test

# Upload test results
trcli -y -c "trcli-config.yml" parse_junit -f "./target/TEST-junit-jupiter.xml"

```

# JUnit5 sample project

## How to use the project

- Replace the placeholders in `trcli-config.yml` with your TestRail instance details
- Execute the commands on the script below

```sh
# Install TR CLI
pip install trcli

# Install test project
mvn clean compile

# Run tests
mvn clean compile test

# Upload test results
trcli -y -c "trcli-config.yml" parse_junit -f "./target/TEST-junit-jupiter.xml"

```

In case you want to run the project using docker instead, you can use the script below.
```sh
# Install TR CLI
pip install trcli

# Execute tests project in docker
docker run -it -v ${PWD}:/usr/src/junit5 -w "/usr/src/junit5" maven:3.6.3-jdk-11-openj9 mvn clean compile test

# Upload test results
trcli -y -c "trcli-config.yml" parse_junit -f "./target/TEST-junit-jupiter.xml"

```

If the TestRail project is created using mode "Use multiple test suites to manage cases", the trcli command is slightlyy difefrent and has to mention the --suite-id as follows:

```sh
# Upload tests results, need to specify the test suite id
trcli -n -c .\trcli-config.yml --project-id "3" parse_junit -f .\target\TEST-junit-jupiter.xml --case-matcher "property" --suite-id "10" --milestone-id "7" --run-id "36"

trcli -n -h "https://souzou.testrail.io" -u "szairi2011@gmail.com" -p "Danialv44{" --project-id "3" --project "TestRail automation 2" parse_junit -f ${{ env.WORKING_DIR }}/target/TEST-junit-jupiter.xml --case-matcher "property" --suite-id "10" --milestone-id "7" --run-id "36"

```