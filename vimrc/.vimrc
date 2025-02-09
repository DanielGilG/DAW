"
"	 _    ___           ____  ______
"	| |  / (_)___ ___  / __ \/ ____/
"	| | / / / __ `__ \/ /_/ / /     
"	| |/ / / / / / / / _, _/ /___   
"	|___/_/_/ /_/ /_/_/ |_|\____/   
"
"
" 	            `___´
" 	            (o o)
" 	           (  V  )
" 	          /--m-m--
" 	         |       |
" 	         | birk  |
" 	         |       |
" 	         ~~~~~~~~~
" 	         Búho Vim
"
"
"--------- Números de las Líneas ---------
set number relativenumber
set nu rnu
highlight LineNr ctermfg = LightGray guifg=LightGray

"--------- Al crear nuevos splits ---------
set  splitright splitbelow

"--------- Para mover los splits con el ratón---------
set mouse=a

"--------- LEADER KEY --------- 
let mapleader = " "
nnoremap <Leader>e :Explore<CR>
nnoremap <Leader>w :w<CR>
nnoremap <Leader>q :wq<CR>
nnoremap <Leader>Q :q!<CR>
nnoremap <Leader>n :NERDTreeToggle<CR>

nnoremap <Leader>h <C-w>h 
nnoremap <Leader>j <C-w>j 
nnoremap <Leader>k <C-w>k 
nnoremap <Leader>l <C-w>l 

" Cerrar la ventana actual
nnoremap <Leader>c <C-w>c

" Maximizar la ventana actual
nnoremap <Leader>m <C-w>_<C-w>|

"--------- PLUGINSS ---------  
call plug#begin()
Plug 'tpope/vim-sensible'
Plug 'https://github.com/preservim/nerdtree.git'
call plug#end()
