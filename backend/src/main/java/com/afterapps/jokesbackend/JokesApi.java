/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.afterapps.jokesbackend;

import com.afterapps.JokesLoader;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "jokesbackend.afterapps.com",
                ownerName = "jokesbackend.afterapps.com",
                packagePath = ""
        )
)
public class JokesApi {

    @ApiMethod(name = "getJoke")
    public Joke getJoke() {
        Joke response = new Joke();
        JokesLoader jokesLoader = new JokesLoader();
        response.setData(jokesLoader.getJoke());
        return response;
    }

}
