; </! ===THERE IS AN AUTO GENERATED NASM FILE FOR mainWind. DON'T EDIT IT!=== !/>
global main
extern printf
section .data
message:db "windslang",0
backN:db 10,0
section .text
main:
call showstr
ret
int 0x10
showstr:
mov rdi,message
call printf