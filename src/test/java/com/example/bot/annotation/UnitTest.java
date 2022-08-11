package com.example.bot.annotation;

import org.junit.jupiter.api.Tag;

import java.lang.annotation.*;

/**
 * The interface Unit test.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Tag("unitTest")
@Inherited
public @interface UnitTest {
}
