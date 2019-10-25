import pandas as pd
from sklearn.model_selection import train_test_split
from sklearn import tree
from sklearn.metrics import accuracy_score

class Tree():
    def __init__(self):
        pass

    def import_csv(self,path,name_Y,test_size):
        df = pd.read_csv(path)
        self.Y = df[name_Y]
        self.X = df.loc[:, df.columns != name_Y]
        self.X_train,self.Y_train,self.X_test,self.Y_test= train_test_split(X, y, test_size=test_size)

    def generate_tree(self):
        self.model = tree.DecisionTreeClassifier()
        self.model.fit(X_train, Y_train)

    def display_accuracy(self):
        print(accuracy_score(Y_test, self.model.predict(X_test)))
