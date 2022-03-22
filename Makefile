# OPENJDK 8 is REQUIRED
# MAVEN 3.3 or later is REQUIRED

evosuite:
	docker run -it -u ${UID} -v ${PWD}:/evosuite evosuite/evosuite:latest -criterion branch -target target/classes/

cobertura:
	docker build -t jsoup .
	docker run -it -v ${PWD}:/app jsoup:latest mvn cobertura:cobertura

get-evosuite:
	wget https://github.com/EvoSuite/evosuite/releases/download/v1.0.6/evosuite-1.0.6.jar
    wget https://github.com/EvoSuite/evosuite/releases/download/v1.0.6/evosuite-standalone-runtime-1.0.6.jar