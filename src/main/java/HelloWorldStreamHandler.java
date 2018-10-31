package main.java;

/**
 * Created by jameshart on 10/30/18.
 */

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
import customintent.HelloWorldIntentHandler;
import handlers.*;

/*
    TO BUILD A NEW JAR
    mvn assembly:assembly -DdescriptorId=jar-with-dependencies package
 */


public class HelloWorldStreamHandler extends SkillStreamHandler {

    private static Skill getSkill() {
        return Skills.standard()
                .addRequestHandlers(
                        new CancelandStopIntentHandler(),
                        new HelloWorldIntentHandler(),
                        new HelpIntentHandler(),
                        new LaunchRequestHandler(),
                        new SessionEndedRequestHandler())
                .withSkillId("amzn1.ask.skill.36c6ea8c-bcf3-4125-b3f1-ade722e2b8d0")
                .build();
    }

    public HelloWorldStreamHandler() {
        super(getSkill());
    }

}