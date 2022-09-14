package com.example.hades.android.gradleconfigcode;

import org.junit.Test;

import static org.junit.Assert.*;

import java.io.InputStream;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
        System.out.println(new Verify().getNum());

//        // /Users/account/Documents/project/AndroidGradleConfig/app/build/intermediates/java_res/procDebugUnitTest/out/a.txt
//        String rootPath = getClass().getResource("/a.txt").getFile().toString();
//        System.out.println(rootPath);
//
//
//        // file:/Users/account/Documents/project/AndroidGradleConfig/app/build/intermediates/java_res/procDebugUnitTest/out/a.txt
//        String rootPath2 = getClass().getResource("/a.txt").toString();
//        System.out.println(rootPath2);
//
//        // file:/Users/account/Documents/project/AndroidGradleConfig/app/build/intermediates/javac/procDebugUnitTest/classes/
//        String rootPath3 = getClass().getResource("/").toString();
//        System.out.println(rootPath3);
//
//        // file:/Users/account/Documents/project/AndroidGradleConfig/app/build/intermediates/javac/procDebugUnitTest/classes/com/example/hades/android/gradleconfigcode/
//        String rootPath4 = getClass().getResource("").toString();
//        System.out.println(rootPath4);

        // Unit Test 如何获得resources的文件？
//        InputStream inputStream = getClass().getResourceAsStream("a.txt");
    }
}