/*
 * Developed by GSK on 5/4/19 7:47 PM.
 * Last Modified 5/4/19 7:47 PM.
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

package random;

import utils.SysOutUtil;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Dummy {
    public static void main(String[] args) {
        // Sort Map based on Values
        sortMapByValues();
    }

    static void sortMapByValues(){
        // Sample Map with FirstName and LastName
        Map<String,String> unSortedMap = new HashMap<>();
        unSortedMap.put("Arya","Stark");
        unSortedMap.put("Bran","Stark");
        unSortedMap.put("Jaime","Lannister");
        unSortedMap.put("Cersei","Lannister");
        unSortedMap.put("Daenerys","Targaryen");

        // Sort Map by LastName
        Map<String,String> sortedMap = unSortedMap
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(e-> e.getKey(), e -> e.getValue(), (k,v) -> k, LinkedHashMap::new));
        SysOutUtil.displayMap(unSortedMap);
        System.out.println("*****");
        SysOutUtil.displayMap(sortedMap);

    }

}
