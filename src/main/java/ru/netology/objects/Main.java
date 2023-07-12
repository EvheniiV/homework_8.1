package ru.netology.objects;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();

        post.name = "Иван";
        post.passport = "4444 №321456";
        post.patronymic = "Иванович";
        post.phone = "+7(999)789-456-123";
        post.surname = "Иванов";
        post.subscription = true;
        post.birthday.day = 13;
        post.birthday.month = 9;
        post.birthday.year = 1969;

    }


}
