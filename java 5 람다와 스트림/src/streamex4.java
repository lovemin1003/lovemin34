import java.util.Arrays;
import java.util.stream.Stream;

public class streamex4 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Stream<String[]> strArrStrm = Stream.of
				(
						new String[] {"aaa","bbb","ccc"},
						new String[] {"AAA","BBB","CCC"}
				);

		Stream<String> strStrm = strArrStrm.flatMap(Arrays::stream);
		
		strStrm.map(String::toLowerCase)
		         .distinct()
		         .sorted()
		         .forEach(System.out::println);
		System.out.println();
		
		String[] lineArr= {
			"aigo aibo aiko",	
			"bibigo zirigo alphago",
		};
		
		Stream<String> lineStream = Arrays.stream(lineArr);
		lineStream.flatMap(line -> Stream.of(line.split(" +")))
		.map(String::toLowerCase)
		 .distinct()
         .sorted()
         .forEach(System.out::println);
System.out.println();

        Stream<String> strStrm1 = Stream.of("AAA","BBB","CCC");
        Stream<String> strStrm2 = Stream.of("aaa","bbb","ccc");
        
        Stream<Stream<String>> strStrmStrm = Stream.of(strStrm1, strStrm2);
        Stream<String> strStream = strStrmStrm
        		.map(s -> s.toArray(String[]::new))
        		.flatMap(Arrays::stream);

        strStream.map(String::toLowerCase)
		 .distinct()
         .forEach(System.out::println);
 

	}

}
