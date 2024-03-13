package com.mylearning.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapVsFlatMapDemo {
    public static void main(String[] args) {
        List<User> users = Stream.of(
         new User("user1","1234567890", Arrays.asList("abc@gmail.com","def@gmail.com")),
                new User("user2","0987654321", Arrays.asList("ghi@gmail.com","jkl@gmail.com")))
                .collect(Collectors.toList());

        List<String> phoneNumLists = users.stream()
                .map(User::getPhone)
                .collect(Collectors.toList());
        System.out.println(phoneNumLists);

        List<List<String>> emailListMap = users.stream()
                .map(User::getEmail)
                .collect(Collectors.toList());
        System.out.println(emailListMap);

       List<String> emailListFlatMap = users.stream()
                .flatMap(user -> user.getEmail().stream())
                .collect(Collectors.toList());
        System.out.println(emailListFlatMap);
    }
}
