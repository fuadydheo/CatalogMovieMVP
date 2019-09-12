package com.example.submissioncatalogmovie.utils;

import com.example.submissioncatalogmovie.model.Model;

import java.util.ArrayList;

public class MoviesData {
    public static String[][] data = new String[][]{
            {"Venom", "2018" , "Investigative journalist Eddie Brock attempts a comeback following a scandal, but accidentally becomes the host of Venom, a violent, super powerful alien symbiote. Soon, he must rely on his newfound powers to protect the world from a shadowy organization looking for a symbiote of their own.", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/cKzu8xiwtCsL1QEptwQ1qtaM3mp.jpg"},
            {"Aquaman", "2018" , "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/5Kg76ldv7VxeX9YlcQXiowHgdX6.jpg"},
            {"Avengers: Endgame", "2019" , "After the devastating events of Avengers: Infinity War, the universe is in ruins due to the efforts of the Mad Titan, Thanos. With the help of remaining allies, the Avengers must assemble once more in order to undo Thanos' actions and restore order to the universe once and for all, no matter what consequences may be in store.", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/ulzhLuWrPK07P1YkdWQLZnQh1JL.jpg"},
            {"Bird Box", "2018" , "Five years after an ominous unseen presence drives most of society to suicide, a survivor and her two children make a desperate bid to reach safety.", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/rGfGfgL2pEPCfhIvqHXieXFn7gp.jpg"},
            {"Bumblebee", "2018" , "On the run in the year 1987, Bumblebee finds refuge in a junkyard in a small Californian beach town. Charlie, on the cusp of turning 18 and trying to find her place in the world, discovers Bumblebee, battle-scarred and broken. When Charlie revives him, she quickly learns this is no ordinary yellow VW bug.", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/HNVRlFrmb4FPiWMqr6i014MTd8.jpg"},
            {"Creed", "2018" , "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life.", ""},
            {"Deadpool", "2018" , "Deadpool tells the origin story of former Special Forces operative turned mercenary Wade Wilson, who after being subjected to a rogue experiment that leaves him with accelerated healing powers, adopts the alter ego Deadpool. Armed with his new abilities and a dark, twisted sense of humor, Deadpool hunts down the man who nearly destroyed his life.", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/inVq3FRqcYIRl2la8iZikYYxFNR.jpg"},
            {"Robin Hood", "2018" , "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/AiRfixFcfTkNbn2A73qVJPlpkUo.jpg"},
            {"The Mule", "2018" , "Earl Stone, a man in his 80s, is broke, alone, and facing foreclosure of his business when he is offered a job that simply requires him to drive. Easy enough, but, unbeknownst to Earl, he’s just signed on as a drug courier for a Mexican cartel. He does so well that his cargo increases exponentially, and Earl hit the radar of hard-charging DEA agent Colin Bates.", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/klazQbxk3yfuZ8JcfO9jdKOZQJ7.jpg"},
            {"Mortal Engines ", "2018" , "Many thousands of years in the future, Earth’s cities roam the globe on huge wheels, devouring each other in a struggle for ever diminishing resources. On one of these massive traction cities, the old London, Tom Natsworthy has an unexpected encounter with a mysterious young woman from the wastelands who will change the course of his life forever.", "https://image.tmdb.org/t/p/w600_and_h900_bestv2/gLhYg9NIvIPKVRTtvzCWnp1qJWG.jpg"},
    };
    public static ArrayList<Model> getListData(){
        ArrayList<Model> list = new ArrayList<>();
        for (String[] aData : data) {
            Model model = new Model();
            model.setName(aData[0]);
            model.setRealease(aData[1]);
            model.setDetail(aData[2]);
            model.setPhoto(aData[3]);
            list.add(model);
        }
        return list;
    }
}
