
# Comando para crear proyecto de tipo Maven

  mvn archetype:generate -DarchetypeArtifactId=maven-archetype-quickstart

    groupId: upeu.edu.pe
    
    artifactId: SubProgramUPeU

    version: V1.0

    package: pe.edu.upeu.app

    Y : : Y

# Agregar el siguiente codigo en el archivo pom.xml
  
  ```xml
    <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>1.7</maven.compiler.source>
    <maven.compiler.target>1.7</maven.compiler.target>
    </properties> 
  ```

  ```xml
  <build>
    <plugins>
      <plugin>
      <!-- Build an executable JAR -->
      <groupId>org.apache.maven.plugins</groupId>
      <artifactId>maven-jar-plugin</artifactId>
      <version>2.4</version>
      <configuration>
      <archive>
      <manifest>
      <mainClass>pe.edu.upeu.app.App</mainClass>
      </manifest>
      </archive>
      </configuration>
      </plugin>
    </plugins>
 </build>
  ```


# Comandos para empaquetar Proyecto MVN
  mvn clean

  mvn clean package

  java -jar target/fileProyect.jar
