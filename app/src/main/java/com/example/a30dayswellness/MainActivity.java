package com.example.a30dayswellness;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import com.example.a30dayswellness.adapter.DayAdapter;
import com.example.a30dayswellness.interFace.OnClickDay;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnClickDay {

    ArrayList<String> days = new ArrayList<>();
    ArrayList<String> titles = new ArrayList<>();
    ArrayList<String> details = new ArrayList<>();
    ArrayList<String> imageUrls = new ArrayList<>();

    private RecyclerView dayRecycler;
    private DayAdapter dayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Day 1
        days.add("Day 1");
        titles.add("Introduction to Wellness");
        details.add("Learn about the importance of wellness and set your goals.");
        imageUrls.add("https://images.pexels.com/photos/20414837/pexels-photo-20414837/free-photo-of-a-person-sitting-on-a-chair-under-a-tree.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");

        // Day 2
        days.add("Day 2");
        titles.add("Morning Meditation");
        details.add("Start your day with a 10-minute meditation session.");
        imageUrls.add("https://images.pexels.com/photos/1027621/pexels-photo-1027621.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");

        // Day 3
        days.add("Day 3");
        titles.add("Healthy Eating Habits");
        details.add("Explore nutritious food choices and meal planning.");
        imageUrls.add("https://images.pexels.com/photos/19833835/pexels-photo-19833835/free-photo-of-this-is-phoenix.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");

        // Day 4
        days.add("Day 4");
        titles.add("Mindful Breathing Exercise");
        details.add("Practice deep breathing techniques for relaxation.");
        imageUrls.add("https://images.pexels.com/photos/68254/pexels-photo-68254.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");

        // Day 5
        days.add("Day 5");
        titles.add("Strength Training Workout");
        details.add("Engage in a 30-minute strength training routine.");
        imageUrls.add("https://images.pexels.com/photos/218001/pexels-photo-218001.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");

        // Day 6
        days.add("Day 6");
        titles.add("Positive Affirmations");
        details.add("Repeat positive affirmations to boost self-confidence.");
        imageUrls.add("https://images.pexels.com/photos/349447/pexels-photo-349447.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");

        // Day 7
        days.add("Day 7");
        titles.add("Outdoor Activity Day");
        details.add("Enjoy nature with a walk, jog, or outdoor workout.");
        imageUrls.add("https://images.pexels.com/photos/1996051/pexels-photo-1996051.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");

        // Day 8
        days.add("Day 8");
        titles.add("Digital Detox Day");
        details.add("Disconnect from screens and engage in offline activities.");
        imageUrls.add("https://images.pexels.com/photos/589821/pexels-photo-589821.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");

        // Day 9
        days.add("Day 9");
        titles.add("Yoga and Stretching");
        details.add("Focus on flexibility and mindfulness with yoga.");
        imageUrls.add("https://images.pexels.com/photos/20669092/pexels-photo-20669092/free-photo-of-a-woman-sitting-in-a-field-with-a-view-of-the-mountains.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");

        // Day 10
        days.add("Day 10");
        titles.add("Healthy Snack Ideas");
        details.add("Discover and prepare nutritious snack options.");
        imageUrls.add("https://images.pexels.com/photos/1296372/pexels-photo-1296372.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");

        // Day 11
        days.add("Day 11");
        titles.add("Journaling for Wellness");
        details.add("Reflect on your thoughts and emotions.");
        imageUrls.add("https://images.pexels.com/photos/537053/pexels-photo-537053.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");

        // Day 12
        days.add("Day 12");
        titles.add("Cardiovascular Workout");
        details.add("Get your heart pumping with cardio exercises.");
        imageUrls.add("https://images.pexels.com/photos/891571/pexels-photo-891571.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");

        // Day 13
        days.add("Day 13");
        titles.add("Gratitude Practice");
        details.add("Express gratitude for the positives in your life.");
        imageUrls.add("https://images.pexels.com/photos/877128/pexels-photo-877128.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");

        // Day 14
        days.add("Day 14");
        titles.add("Self-Care Spa Day");
        details.add("Pamper yourself with self-care treatments.");
        imageUrls.add("https://images.pexels.com/photos/2131661/pexels-photo-2131661.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");

        // Day 15
        days.add("Day 15");
        titles.add("Mental Health Check-In");
        details.add("Assess and prioritize your mental well-being.");
        imageUrls.add("https://images.pexels.com/photos/2131784/pexels-photo-2131784.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");

        // Day 16
        days.add("Day 16");
        titles.add("Balanced Meal Planning");
        details.add("Create balanced meal plans for optimal nutrition.");
        imageUrls.add("https://images.pexels.com/photos/2049001/pexels-photo-2049001.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");

        // Day 17
        days.add("Day 17");
        titles.add("Creative Expression");
        details.add("Engage in a creative activity like painting or writing.");
        imageUrls.add("https://images.pexels.com/photos/10713035/pexels-photo-10713035.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");

        // Day 18
        days.add("Day 18");
        titles.add("Relaxation Techniques");
        details.add("Learn and practice relaxation techniques.");
        imageUrls.add("https://images.pexels.com/photos/3838496/pexels-photo-3838496.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");

        // Day 19
        days.add("Day 19");
        titles.add("Social Connection Day");
        details.add("Connect with loved ones or join a social activity.");
        imageUrls.add("https://images.pexels.com/photos/3942874/pexels-photo-3942874.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");

        // Day 20
        days.add("Day 20");
        titles.add("Mindfulness Meditation");
        details.add("Practice mindfulness for stress reduction.");
        imageUrls.add("https://images.pexels.com/photos/3942877/pexels-photo-3942877.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");

        // Day 21
        days.add("Day 21");
        titles.add("Time Management Tips");
        details.add("Organize your tasks and manage your time effectively.");
        imageUrls.add("https://images.pexels.com/photos/3942876/pexels-photo-3942876.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");

        // Day 22
        days.add("Day 22");
        titles.add("Hydration Awareness");
        details.add("Focus on staying hydrated throughout the day.");
        imageUrls.add("https://images.pexels.com/photos/2804327/pexels-photo-2804327.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");

        // Day 23
        days.add("Day 23");
        titles.add("Sleep Quality Assessment");
        details.add("Evaluate and improve your sleep quality.");
        imageUrls.add("https://images.pexels.com/photos/14132917/pexels-photo-14132917.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");

        // Day 24
        days.add("Day 24");
        titles.add("Emotional Well-Being");
        details.add("Explore strategies for emotional resilience.");
        imageUrls.add("https://images.pexels.com/photos/12103410/pexels-photo-12103410.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");

        // Day 25
        days.add("Day 25");
        titles.add("Goal Setting Review");
        details.add("Review and adjust your wellness goals.");
        imageUrls.add("https://images.pexels.com/photos/14632859/pexels-photo-14632859.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");

        // Day 26
        days.add("Day 26");
        titles.add("Stress Management Techniques");
        details.add("Learn and apply stress management skills.");
        imageUrls.add("https://images.pexels.com/photos/8911469/pexels-photo-8911469.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");

        // Day 27
        days.add("Day 27");
        titles.add("Healthy Cooking Class");
        details.add("Attend or host a healthy cooking workshop.");
        imageUrls.add("https://images.pexels.com/photos/19896270/pexels-photo-19896270/free-photo-of-a-black-and-white-photo-of-a-lighthouse-on-the-rocks.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");

        // Day 28
        days.add("Day 28");
        titles.add("Fitness Challenge Day");
        details.add("Take on a fitness challenge or set new fitness goals.");
        imageUrls.add("https://images.pexels.com/photos/2148826/pexels-photo-2148826.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");

        // Day 29
        days.add("Day 29");
        titles.add("Gratitude Journaling");
        details.add("Continue gratitude journaling for positivity.");
        imageUrls.add("https://images.pexels.com/photos/2403014/pexels-photo-2403014.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");

        // Day 30
        days.add("Day 30");
        titles.add("Reflection and Celebration");
        details.add("Reflect on your wellness journey and celebrate achievements!");
        imageUrls.add("https://images.pexels.com/photos/3677087/pexels-photo-3677087.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1");

        dayRecycler=findViewById(R.id.day_recycler);
        dayRecycler.setHasFixedSize(true);
        dayRecycler.setLayoutManager(new LinearLayoutManager(this));

        dayAdapter=new DayAdapter(days,titles,details,imageUrls,this,this);

        dayRecycler.setAdapter(dayAdapter);



    }

    @Override
    public void onClickDayItem(String day) {
        Log.d("TAG", "onClickDayItem: "+day);
    }
}