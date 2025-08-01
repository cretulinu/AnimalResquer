 public class Animal{
        private String name;
        private int age;
        private int healthLevel;
        private int hungerLevel;
        private int moodLevel;
        private String favoriteFood;
        private String favoriteActivity;

        public void eat(){
            System.out.println(name + " is eatting");
        }

        public void sleep(){
            System.out.println(name + " is sleeping");
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public int getHealthLevel() {
            return healthLevel;
        }
        public void setHealthLevel(int healthLevel) {
            this.healthLevel = healthLevel;
        }
        public int getHungerLevel() {
            return hungerLevel;
        }
        public void setHungerLevel(int hungerLevel) {
            this.hungerLevel = hungerLevel;
        }
        public int getMoodLevel() {
            return moodLevel;
        }
        public void setMoodLevel(int moodLevel) {
            this.moodLevel = moodLevel;
        }
        public string getFavoriteFood() {
            return favoriteFood;
        }
        public void setFavoriteFood(String favoriteFood) {
            this.favoriteFood = favoriteFood;
        }
        public String getFavoriteActivity() {
            return favoriteActivity;
        }
        public void setFavoriteActivity(String favoriteActivity) {
            this.favoriteActivity = favoriteActivity;
        }

    }