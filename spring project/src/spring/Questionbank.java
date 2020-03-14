package spring;

import java.util.Iterator;
import java.util.List;

public class Questionbank {
	int qid;
	String question;
	List<String>answers;
	public Questionbank(int qid,String question,List<String>answers) {
		this.qid=qid;
		this.question=question;
		this.answers=answers;
	}
	public int getQid() {
		return qid;
	}
	public void setQid(int qid) {
		this.qid = qid;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	public void showAnswers() {
		System.out.println(qid+question);
		Iterator itr=answers.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
