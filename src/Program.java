import ExamDatabase.Answer;
import ExamDatabase.Exam;
import ExamDatabase.ExamDB;
import ExamDatabase.Question;
 
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				ExamDB exam = new ExamDB();
				Exam ex = new Exam(1);
				for(Question q:ex.Questions())
				{
					System.out.println(q.Value);
					for(Answer a:q.Answers())
					{
						System.out.println(a.Value);
					}
				}
	}
}
