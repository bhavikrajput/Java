START 200
I DC '1'
TEN DC '10'
MOVER AREG,I
LOOP COMP AREG,TEN
BG GT HLT
PRINT I
ADD AREG,ONE
MOVEM AREG,I
BC ANY LOOP
HLT STOP
ONE DC '1'
END
























