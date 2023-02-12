package behavioral.iterator;

public class Robot implements Collection {
    private int a;
    public String[] skills;
    Iterator iterator;

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public Robot(String[] skills) {
        this.skills = skills;
    }

    @Override
    public Iterator getIterator() {
        return new SkillIterator();
    }

    private class SkillIterator implements Iterator {
        private int i;

        @Override
        public boolean hasNext() {
            if (i < skills.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return skills[i++];
        }
    }
}
