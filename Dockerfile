# Start with a base image containing Java runtime
			FROM openjdk:8-jdk
			# Make port 8888 available to the world outside this container
			EXPOSE 8888
			ADD target/calc-service.war calc-service.war
			# Run the war file
			ENTRYPOINT ["java","-jar","calc-service.war"]
