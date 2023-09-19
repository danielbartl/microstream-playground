package com.danielbartl.mongodb;

import one.microstream.storage.embedded.types.EmbeddedStorage;
import one.microstream.storage.embedded.types.EmbeddedStorageManager;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class HelloWorldTest {

    @Test
    @DisplayName("""
            Basic Hello World test with MicroStream.
            """)
    void helloWorldTest() {

        final EmbeddedStorageManager storageManager = EmbeddedStorage.start();

        System.out.println(storageManager.root());

        storageManager.shutdown();

    }
}
