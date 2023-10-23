package br.usp.icmc.labes.mealyInference.utils;

import de.learnlib.algorithms.kv.mealy.AdaptiveKVM;
import de.learnlib.algorithms.kv.mealy.IncKVM;
import de.learnlib.algorithms.kv.mealy.KearnsVaziraniMealy;
import de.learnlib.algorithms.ttt.mealy.TTTLearnerMealy;
import de.learnlib.datastructure.observationtable.OTLearner.OTLearnerMealy;
import de.learnlib.util.ExperimentDebug.MealyExperiment;
import net.automatalib.words.Word;

public class ExperimentAndLearner {
	
	private OTLearnerMealy learner;
	private MealyExperiment experiment;
	private TTTLearnerMealy learner_ttt;
//	private OTLearnerMealy learner_kv;
	private KearnsVaziraniMealy learner_kv;
	private IncKVM learner_akv;

	public ExperimentAndLearner(OTLearnerMealy learner, MealyExperiment experiment) {
		this.learner = learner;
		this.experiment = experiment;
	}
	
	public ExperimentAndLearner(TTTLearnerMealy tttlearner, MealyExperiment experiment) {
		this.learner_ttt = tttlearner;
		this.experiment = experiment;
	}
	public ExperimentAndLearner(KearnsVaziraniMealy kvlearner, MealyExperiment experiment) {
		this.learner_kv = kvlearner;
		this.experiment = experiment;
	}
	
	public ExperimentAndLearner(IncKVM learner, MealyExperiment experiment) {
		this.learner_akv = learner;
		this.experiment = experiment;
	}

	public MealyExperiment getExperiment() {
		return experiment;
	}
	
	public OTLearnerMealy getLearner() {
		return learner;
	}
	
	public OTLearnerMealy getLearner_TTT() {
		return learner_ttt;
	}
	public KearnsVaziraniMealy getLearner_KV() {
		return learner_kv;
	}
	public IncKVM getLearner_AKV() {
		return learner_akv;
	}
}
