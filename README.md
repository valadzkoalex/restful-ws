# restful-ws
RESTful WS for jacoco demo

# To run WS with jacoco agent:
1. download jacoco runtime agent <p>
_wget https://repo1.maven.org/maven2/org/jacoco/org.jacoco.agent/0.8.8/org.jacoco.agent-0.8.8-runtime.jar_
2. specify env variables for bootRun gradle task and run WS: <p>
_JAVA_OPTIONS=-javaagent:org.jacoco.agent-0.8.8-runtime.jar=destfile=coverage.exec_

3. after tests execution it is needed to terminate WS
4. run _jacocoCoverageReport_ gradle task to collect report
5. run _jacocoCoverageVerification_ gradle task to verify coverage