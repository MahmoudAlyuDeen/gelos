package com.afterapps.jokesbackend;

/**
 * The object model for the data we are sending through endpoints
 */
class Joke {

    private String jokeBody;

    public String getData() {
        return jokeBody;
    }

    public void setData(String data) {
        jokeBody = data;
    }
}