/*
 * Developed by GSK on 5/4/19 10:38 PM.
 * Last Modified 5/4/19 9:01 PM.
 * Copyright (c) 2019.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package utils;import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Utility class to Sysout values for Debugging/Analysis.
 */
public class SysOutUtil {

    public static <T> void displayIntArray(int[] nums){
        Arrays.stream(nums).forEach(e -> {
            System.out.println(e);
        });
    }


    public static <T> void displayList(List<T> list){
        list.stream().forEach(e -> {
            System.out.println(e.toString());
        });
    }

    public static <K,V> void displayMap(Map<K,V> map){
        map.entrySet()
            .stream()
            .forEach(e -> {
                System.out.println("Key="+e.getKey().toString() + " - Value="+e.getValue().toString());
            });
    }

    public static <T>void displayObjectArray(T[] array){
        Arrays.stream(array)
                .forEach(e ->
                    System.out.println(e.toString()));
    }

    public static void displayStackTrace(){
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for(StackTraceElement stackTraceElement: stackTraceElements){
            System.out.println(stackTraceElement.toString());
        }
    }



}
