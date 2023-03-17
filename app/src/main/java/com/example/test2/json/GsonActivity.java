package com.example.test2.json;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.test2.R;
import com.google.gson.Gson;

/**
 * 2023.3.17    gson的用法
 */
public class GsonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gson);
        jsonTest();
    }

    private void jsonTest() {
        // 创建一个User对象
        User user = new User("Alice", 30);

        // 创建Gson实例
        Gson gson = new Gson();

        // 将User对象序列化为JSON字符串
        String jsonString = gson.toJson(user);
        System.out.println("Serialized JSON: " + jsonString);

        // 将JSON字符串反序列化为User对象
        User deserializedUser = gson.fromJson(jsonString, User.class);
        System.out.println("Deserialized User: " + deserializedUser.getName() + ", " + deserializedUser.getAge());

    }
}