import javax.crypto.SecretKey;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import java.security.spec.AlgorithmParameterSpec;

import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;

public class AES_IV {

    public static void main(String[] args) throws Exception {
        System.out.println(encrypt("테스트"));
        System.out.println(encrypt("01012345678"));
        System.out.println(encrypt("12가1234"));
        System.out.println(encrypt("안녕하세요"));

    }

    static String encrypt(String msg) throws Exception {
        String alg = "AES/CBC/PKCS5Padding";
        String key = "1b5cd72fd0284daf840f93eb8288e9e6";
        String iv2 = "0000000000000000";

        try {
            SecretKey secretKey = new SecretKeySpec(key.getBytes("UTF-8"),
                    "AES");
            Cipher cipher = Cipher.getInstance(alg);
            cipher.init(Cipher.ENCRYPT_MODE, secretKey, new IvParameterSpec(iv2.getBytes()));
            byte[] bytes = cipher.doFinal(msg.getBytes("UTF-8"));

            String encStr = Base64.getEncoder().encodeToString(Base64.getEncoder().encode(bytes));
            return encStr;

        } catch (NoSuchAlgorithmException e) {
            return "";
        }
    }

    static String decrypt(String msg) throws Exception {
        String alg = "AES/CBC/PKCS5Padding";
        String key = "1b5cd72fd0284daf840f93eb8288e9e6";
        String iv2 = "0000000000000000";
        try {
            byte[] decodedBytes = Base64.getDecoder().decode(Base64.getDecoder().decode(msg));

            IvParameterSpec ivSpec = new IvParameterSpec(iv2.getBytes());
            SecretKeySpec secretKey = new SecretKeySpec(key.getBytes("UTF-8"), "AES");
            Cipher cipher = Cipher.getInstance(alg);
            cipher.init(Cipher.DECRYPT_MODE, secretKey, ivSpec);
            return new String(cipher.doFinal(decodedBytes), "UTF-8");

        } catch (NoSuchAlgorithmException e) {
            return "";
        }
    }
}
