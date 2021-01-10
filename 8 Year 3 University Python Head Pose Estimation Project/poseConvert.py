
def poseConvert(poseNum):
    poseStr = ""
    if poseNum == 0 or poseNum == 10:
        poseStr = "0deg Straight 0deg Level"
    elif poseNum == 1 or poseNum == 11:
        poseStr = "0deg Straight 12deg Up"
    elif poseNum == 5 or poseNum == 15:
        poseStr = "0deg Straight 12deg down"
    elif poseNum == 2:
        poseStr = "12deg Left 12deg Up"
    elif poseNum == 3:
        poseStr = "12deg Left 12deg Level"
    elif poseNum == 4:
        poseStr = "12deg Left 12deg Down"
    elif poseNum == 6:
        poseStr = "24deg Left 24deg Up"
    elif poseNum == 7:
        poseStr = "24deg Left 0deg Level"
    elif poseNum == 8:
        poseStr = "24deg Left 24deg Down"
    elif poseNum == 12:
        poseStr = "12deg Right 12deg Up"
    elif poseNum == 13:
        poseStr = "12deg Right 12deg Level"
    elif poseNum == 14:
        poseStr = "12deg Right 12deg Down"
    elif poseNum == 16:
        poseStr = "24deg Right 24deg Up"
    elif poseNum == 17:
        poseStr = "24deg Right 0deg Level"
    elif poseNum == 18:
        poseStr = "24deg Right 24deg Down"
    return poseStr


