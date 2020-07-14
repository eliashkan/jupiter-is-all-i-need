# A project to illustrate unit testing with JUnit Jupiter

## A simple setup

You only need to import the junit.jupiter dependency to get access to the API, parameterized tests and the engine. 
        
    <dependencies>
    
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>5.6.2</version>
            <scope>test</scope>
        </dependency>
    
    </dependencies>

## A simple program

Say my name should only say a name

        public String methodToTestWhichShouldReturnMyName() {
            return "ELIAS";
        }


## A simple test

The unit test for this program checks if the correct name is actually returned. 

    @Test
    void testMyName() {
        SayMyName smn = new SayMyName();
        String result = smn.methodToTestWhichShouldReturnMyName();
        assertTrue(
                "elias".equalsIgnoreCase(result),
                "this method should return my name!");

    }

assertTrue() is a static method from the org.junit.jupiter.api.Assertions class. 
This method is called statically by using a static import statement at the top of the file

    import static org.junit.jupiter.api.Assertions.*;
