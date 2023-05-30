import random

response = {
    'hi': ["hello!", "hi there!", "hi!"],
    'how are you': ["i am good ,thanks", "i am doing well,thank you", "i am fine,thanks"],
    "what's your name": ["i am chatbot", 'my name is chatbot', "myself chatbot", "i am just a chatbot,i dont have a name"],
    'bye': ['goodbye', 'bye', 'see you there!'],
    'thank you': ['you are welcome', 'no problem', 'anytime'],
    'default': ["i am sorry,i dont understant", 'can you please rephrase that?', "i am not sure what you mean"]
}


def chatbot():
    print(random.choice(response['hi']))

    while True:
        message = input(">")

        if "hi" in message.lower():
            print(random.choice(response['hi']))
        elif "how are you" in message.lower():
            print(random.choice(response['how are you']))
        elif "bye" in message.lower():
            print(random.choice(response["bye"]))
        elif "thank you" in message.lower():
            print(random.choice(response['thank you']))
        else:
            print(random.choice(response['default']))


chatbot()
