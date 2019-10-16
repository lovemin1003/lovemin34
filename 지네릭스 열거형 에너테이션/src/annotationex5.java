import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.*;

import java.text.Annotation;

@Deprecated
@SuppressWarnings("1111") // 유효하지 않은 애너테이션은 무시됨.
@TestInfo(testedBy="aaa", testDate=@DateTime(yymmdd="160101",hhmmss="235959"))
public class annotationex5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//annotationex5의 객체를 얻는다.
		Class<annotationex5> cls = annotationex5.class;
		
		TestInfo anno = (TestInfo)cls.getAnnotation(TestInfo.class);
		
		System.out.println("anno.testedBy()="+anno.testedBy());
		System.out.println("anno.testDate().yymmdd()="+anno.testDate().yymmdd());
		System.out.println("anno.testDate().hhmmss()="+anno.testDate().hhmmss());
		
		for(String str : anno.testTools())
		{
			System.out.println("testTools="+str);
		}
		System.out.println();
		
		//annotationex5에 적용된 모든 애너테이션을 가져온다.
		java.lang.annotation.Annotation[] annoArr = cls.getAnnotations();
		
		for(java.lang.annotation.Annotation a : annoArr)
		{
			System.out.println(a);
		}
		
		
		}//메인의 끝.

	}

@Retention(RetentionPolicy.RUNTIME) // 실행시에 사용 가능하도록 지정
@interface TestInfo
{
	int count() default 1;
	String testedBy();
	String[] testTools() default "JUnit";
	TestType testType() default TestType.FIRST;
	DateTime testDate();
	
}

@Retention(RetentionPolicy.RUNTIME) // 실행시에 사용 가능하도록 지정
@interface DateTime
{
	String yymmdd();
	String hhmmss();
}

enum TestType 
{
	FIRST, FINAL;
}

