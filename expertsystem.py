class ExpertSystem:
    def __init__(self):
        self.knowledge_base = {
            'condition1': {'symptom1': 3, 'symptom2': 2, 'symptom3': 1},
            'condition2': {'symptom2': 3, 'symptom4': 2, 'symptom5': 1},
            'condition3': {'symptom1': 1, 'symptom3': 1, 'symptom6': 2},
            # Add more conditions and their corresponding symptoms and severity levels
        }
    
    def assess_severity(self, symptoms):
        severity = 0
        for symptom in symptoms:
            for condition, symptom_dict in self.knowledge_base.items():
                if symptom in symptom_dict:
                    severity += symptom_dict[symptom]
        return severity
    
    def triage(self, symptoms):
        severity = self.assess_severity(symptoms)
        
        if severity >= 8:
            return "High priority. Immediate medical attention required."
        elif severity >= 5:
            return "Medium priority. Urgent medical attention required."
        else:
            return "Low priority. Non-urgent medical attention required."

# Example usage
expert_system = ExpertSystem()

# Example symptoms input
patient_symptoms = ['symptom2', 'symptom2', 'symptom2']

triage_result = expert_system.triage(patient_symptoms)
print(triage_result)
