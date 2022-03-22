#!/bin/bash
wget https://github.com/EvoSuite/evosuite/releases/download/v1.0.6/evosuite-1.0.6.jar
wget https://github.com/EvoSuite/evosuite/releases/download/v1.0.6/evosuite-standalone-runtime-1.0.6.jar

export EVOSUITE="java -jar $(pwd)/evosuite-1.0.6.jar"