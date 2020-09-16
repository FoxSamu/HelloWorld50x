package net.shadew.helloworld.hw19;

import jdk.nashorn.api.scripting.NashornScriptEngine;
import jdk.nashorn.api.scripting.NashornScriptEngineFactory;

import javax.script.ScriptEngine;
import javax.script.ScriptException;
import java.util.Base64;

public class Main {
    public static void main(String[] args) {
        ScriptEngine engine = new NashornScriptEngineFactory().getScriptEngine();
        try {
            engine.eval("print('Hello world!');");
        } catch (ScriptException e) {
            // Fallback, if scripting is broken
            System.out.print("Hello world!");
        }
    }
}
