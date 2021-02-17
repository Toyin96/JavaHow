package com;

import java.security.SecureRandom;

public class SentenceGenerator {

    private String[] articles = {"the", "a", "one", "some", "any"};
    private String[] nouns = {"boy", "girl", "dog", "town", "car"};
    private String[] verbs = {"drove", "jumped", "ran", "walked", "skipped"};
    private String[] prepositions = {"to", "from", "drove", "under", "on"};


    public String[] getNoun() {
        return nouns;
    }

    public void setNoun(String[] noun) {
        this.nouns = noun;
    }

    public String[] getVerbs() {
        return verbs;
    }

    public void setVerbs(String[] verbs) {
        this.verbs = verbs;
    }

    public String[] getPreposition() {
        return prepositions;
    }

    public void setPreposition(String[] preposition) {
        this.prepositions = preposition;
    }

    public String[] getArticles() {
        return articles;
    }

    public void setArticles(String[] articles) {
        this.articles = articles;
    }

    public String getSentence() {
        StringBuilder builder = new StringBuilder();

        String space = " ";
        SecureRandom random = new SecureRandom();
        int wordIndex = random.nextInt(5);
        String article = articles[wordIndex];
        char firstletter = article.charAt(0);
        firstletter = Character.toLowerCase(firstletter);
        article = article.replace(article.charAt(0), firstletter);
        builder.append(article);
        builder.append(space);
        String noun = nouns[wordIndex];
        builder.append(noun);
        builder.append(space);
        String verb = verbs[wordIndex];
        builder.append(verb);
        builder.append(space);
        String preposition = prepositions[wordIndex];
        builder.append(preposition);
        builder.append(space);
        String article1 = articles[wordIndex];
        builder.append(article1);
        builder.append(space);
        String noun1 = nouns[wordIndex];
        builder.append(noun1);
        builder.append(".");


        return builder.toString();
    }
}