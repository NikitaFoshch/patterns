package behavioral.visitor;

public class Database implements Web {

        Web[] webs;
        public Database() {
            webs = new Web[]{new Text(), new Media()};
        }
    @Override
        public void accept (Visitor visitor){
            for (int i = 0; i < webs.length; i++) {
                webs[i].accept(visitor);
            }
            visitor.visit(this);
        }
}