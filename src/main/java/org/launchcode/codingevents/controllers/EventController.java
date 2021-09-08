package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

//    private static List<String> events = new ArrayList<>();

    //Making events as HashList
HashMap<String, String> events = new HashMap<>();

    @GetMapping
    public String displayAllEvents(Model model){
//        List<String> events = new ArrayList<>();
//        events.add("Code With Pride");
//        events.add("Strange Loop");
//        events.add("Apple WWDC");
//        events.add("SpringOne Platform");
//        model.addAttribute("events",events);
//        return "events/index";

        //Adding key/values to the Hashmap
        events.put("Code With Pride","First Event");
        events.put("Strange Loop","Second Event");
        events.put("Apple WWDC","Third Event");
        model.addAttribute("events",events);
        return "events/index";
}

//lives at /events/create/
    @GetMapping("create")
    public String renderCreateEventForm(){
        return "events/create";
}

    //lives at /events/create/
@PostMapping("create")
public String createEvent(@RequestParam String eventName){
//    events.add(eventName);
    events.put(eventName,"Default Description");
    return "redirect:"; //redirects to the homepage (/events)
}

//lives at /events/address
@GetMapping("address")
    public String renderAddress(){
        return "events/address";
    }


}