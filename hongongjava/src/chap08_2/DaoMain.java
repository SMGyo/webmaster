package chap08_2;

public class DaoMain {

	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MysqlDao());

	}

	static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

}
