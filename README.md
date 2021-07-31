# spring-qualifier
A demo project to understand how spring qualifier works.

# Use case
Implement file readers for CSV and Text files

#Implementation details

Created an IFileReader interface and with multiple implementations of TextFileReader and CSVFileReader.

TextFileReader is annotated as Primary, so that default auto wiring of IFileReader across the classes will have TextFileReader implementation.

CSVFileReader is annotated with a qualifier, giving the capability to autowire IFileReader for CSVFileReader implementation where ever needed.

If we don't use @Primnry and @Qualifier annotations below would be the error and the recommended actions.

============================================================================================

Field txtReader in com.nani454.learning.main.AppMain required a single bean, but 2 were found:

	- CSVFileReader: defined in file [C:\XXXXX\spring-qualifier\target\classes\com\nani454\learning\service\CSVFileReader.class]
	
	- textFileReader: defined in file [C:\XXXXX\spring-qualifier\target\classes\com\nani454\learning\service\TextFileReader.class]



Action:

Consider marking one of the beans as @Primary, updating the consumer to accept multiple beans, or using @Qualifier to identify the bean that should be consumed
