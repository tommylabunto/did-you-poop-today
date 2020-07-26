package com.xingtingkai.DidYouPoopToday;

import com.google.common.collect.ImmutableList;

import java.util.Random;

// helper class to generate memes
public final class MemeList {

    static ImmutableList<String> createPoopedMemeList() {

        return new ImmutableList.Builder<String>()
                .add("file:///android_asset/yes/mind_blown.gif")
                .add("file:///android_asset/yes/do_it_again.jpg")
                .add("file:///android_asset/yes/ozon_salute.jpg")
                .add("file:///android_asset/yes/satisfied_seal.jpg")
                .add("file:///android_asset/yes/shit_got_real.jpg")
                .add("file:///android_asset/yes/waffle_cat.jpg")
                .build();
    }

    static String randomPoopString() {

        ImmutableList<String> poopList = createPoopedMemeList();

        Random random = new Random();
        // number will be between 0 and pooplist.size - 1 (which fits nicely with .get())
        int randomNum = random.nextInt(poopList.size());

        return poopList.get(randomNum);
    }

    static ImmutableList<String> createNoPoopMemeList() {

        return new ImmutableList.Builder<String>()
                .add("file:///android_asset/no/blinking_guy.jpg")
                .add("file:///android_asset/no/cena_confuses.gif")
                .add("file:///android_asset/no/cricket_man.jpg")
                .add("file:///android_asset/no/impossibru.jpg")
                .add("file:///android_asset/no/pepe_punch.jpg")
                .build();
    }

    static String randomNoPoopString() {

        ImmutableList<String> noPoopList = createNoPoopMemeList();

        Random random = new Random();
        // number will be between 0 and pooplist.size - 1 (which fits nicely with .get())
        int randomNum = random.nextInt(noPoopList.size());

        return noPoopList.get(randomNum);
    }
}
