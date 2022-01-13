package com.schneider.wc;

import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.api.common.functions.FilterFunction;

/**
 * @author SESA618859
 */
public class Stream_WordCountOf_Java {
    public static void main(String[] args) throws Exception {

        final StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        DataStream<Person> flintstones = env.fromElements(
                new Person("Fred", 35),
                new Person("Wilma", 35),
                new Person("Pebbles", 2));

        DataStream<Person> adults = flintstones.filter((FilterFunction<Person>) person -> person.age >= 18);

        adults.print();

        env.execute();
    }

    public static class Person {
        public String name;
        public Integer age;

        public Person() {
        };

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        ;

//        @Override
//        public String toString() {
//            return this.name.toString() + ": age " + this.age.toString();
//        }
//
//        ;
    }
}


