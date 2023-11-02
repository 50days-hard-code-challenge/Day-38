from typing import *

def dataTypes(type: str):
    type=type.lower()
    if type=='integer':
        return 4
    if type=='long':
        return 8
    if type=='float':
        return 4
    if type=='double':
        return 8
    if type=='character':
        return 1

    pass
