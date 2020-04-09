package com.foo.bar.car.utils;

import com.ruishanio.Ksuid;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
public class KSUIDGenerator {

    public static String generateKSUID() {
        try {
            final Ksuid ksuid = new Ksuid();
            final String uid = ksuid.generate();
            //log.info("uid ", uid);
            final String decoded = ksuid.parse(uid);
            //log.info("Parsed KSUID ", decoded);
            return uid;
        } catch (IOException e) {
            //log.error(e.getLocalizedMessage());
        }
        return null;
    }
}