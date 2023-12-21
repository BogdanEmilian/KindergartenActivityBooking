package com.example.demo.hashing;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class PasswordHashing {
    public static String hash(String data)
    {
        try
        {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(data.getBytes(StandardCharsets.UTF_8));

            StringBuilder hexString = new StringBuilder();

            for(int i=0; i<hash.length; i++)
            {
                String hexadecimal = Integer.toHexString(0xff & hash[i]);
                hexString.append(hexadecimal);
            }

            return hexString.toString();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
