package com.roland.android.data.data_source

import com.roland.android.domain.entity.Question

val questions = mutableListOf(
	Question(
		id = 0,
		question = "Where does deoxygenated blood enter the heart?",
		options = listOf(
			"Left atrium",
			"Right ventricle",
			"Right atrium",
			"Left ventricle"
		),
		answer = "Right atrium"
	),
	Question(
		id = 1,
		question = "Which valve separates the right atrium from the right ventricle?",
		options = listOf(
			"Pulmonary valve",
			"Mitral valve",
			"Tricuspid valve",
			"Aortic valve"
		),
		answer = "Tricuspid valve"
	),
	Question(
		id = 2,
		question = "Where does blood go after leaving the right ventricle?",
		options = listOf(
			"Pulmonary artery",
			"Aorta",
			"Pulmonary vein",
			"Superior vena cava"
		),
		answer = "Pulmonary artery"
	),
	Question(
		id = 3,
		question = "What happens to blood in the lungs?",
		options = listOf(
			"Oxygenation",
			"Deoxygenation",
			"Filtration",
			"Coagulation"
		),
		answer = "Oxygenation"
	),
	Question(
		id = 4,
		question = "Which blood vessels carry oxygenated blood back to the heart?",
		options = listOf(
			"Pulmonary arteries",
			"Pulmonary veins",
			"Aorta",
			"Inferior vena cava"
		),
		answer = "Pulmonary veins"
	),
	Question(
		id = 5,
		question = "Which chamber of the heart pumps blood to the rest of the body?",
		options = listOf(
			"Left atrium",
			"Right ventricle",
			"Right atrium",
			"Left ventricle"
		),
		answer = "Left ventricle"
	),
	Question(
		id = 6,
		question = "What is the name of the valve between the left atrium and left ventricle?",
		options = listOf(
			"Pulmonary valve",
			"Mitral valve",
			"Tricuspid valve",
			"Aortic valve"
		),
		answer = "Mitral valve"
	),
	Question(
		id = 7,
		question = "Which blood vessel carries deoxygenated blood from the heart to the lungs?",
		options = listOf(
			"Pulmonary vein",
			"Aorta",
			"Pulmonary artery",
			"Superior vena cava"
		),
		answer = "Pulmonary artery"
	),
	Question(
		id = 8,
		question = "Where does oxygenation of blood occur in the circulatory system?",
		options = listOf(
			"Heart",
			"Brain",
			"Lungs",
			"Liver"
		),
		answer = "Lungs"
	),
	Question(
		id = 9,
		question = "Which ventricle pumps blood to the pulmonary artery?",
		options = listOf(
			"Left ventricle",
			"Right ventricle",
			"Both ventricles",
			"Neither ventricle"
		),
		answer = "Right ventricle"
	)
)