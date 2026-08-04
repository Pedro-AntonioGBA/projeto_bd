package br.edu.ifpb.bd.projeto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.edu.ifpb.bd.projeto.dao.FornecedorDAO;
import br.edu.ifpb.bd.projeto.model.Fornecedor;
import br.edu.ifpb.bd.projeto.dao.IngredienteDAO;
import br.edu.ifpb.bd.projeto.model.Ingrediente;

@Controller
@RequestMapping("/fornecedores")
public class FornecedorController {
    
    private final FornecedorDAO fornecedorDAO;

    // Mensagens de erro e sucesso para exibição ao usuário
    private static final String MENSAGEM_SUCESSO = "Operação realizada com sucesso!";
    private static final String MENSAGEM_ERRO = "Houve um erro ao realizar a operação.";
    private static final String NOME_VARIAVEL_MENSAGEM_SUCESSO = "mensagemSucesso";
    private static final String NOME_VARIAVEL_MENSAGEM_ERRO = "mensagemErro";

    public FornecedorController(FornecedorDAO fornecedorDAO) {
        this.fornecedorDAO = fornecedorDAO;
    }

    @GetMapping
    public String listar(Model model) throws Exception {
        // CORREÇÃO 1: Mudamos de "ingrediente" para "ingredientes" (plural) para bater com o HTML
        model.addAttribute("fornecedores", fornecedorDAO.listar());
        return "listFornecedores";
    }

    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("fornecedor", new Fornecedor());
        
        // CORREÇÃO 2: Descomentado e ajustado para enviar a lista de fornecedores para o <select>
        /*try {
            model.addAttribute("fornecedores", fornecedorDAO.listar());
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        
        return "formFornecedor";
    }

    @PostMapping
    public String salvar(@ModelAttribute Fornecedor fornecedor, RedirectAttributes redirectAttributes) {
        try {
            if (fornecedor.getId() == null) {
                fornecedorDAO.salvar(fornecedor);
            } else {
                fornecedorDAO.atualizar(fornecedor);
            }
            redirectAttributes.addFlashAttribute(NOME_VARIAVEL_MENSAGEM_SUCESSO, MENSAGEM_SUCESSO);
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute(NOME_VARIAVEL_MENSAGEM_ERRO, MENSAGEM_ERRO);
            e.printStackTrace();
        }
       
        return "redirect:/fornecedores";
    }

    @GetMapping("/editar/{id}")
    public String encaminhaParaEdicao(@PathVariable Integer id, Model model) throws Exception {
        model.addAttribute("fornecedor", fornecedorDAO.buscar(id));
        
        // CORREÇÃO 3: Aqui também precisamos enviar os fornecedores para a tela de edição
        /*try {
            model.addAttribute("fornecedores", fornecedorDAO.listar());
        } catch (Exception e) {
            e.printStackTrace();
        }*/
        
        return "editarFornecedor";
    }

    @GetMapping("/excluir/{id}")
    public String encaminhaParaExclusao(@PathVariable Integer id, Model model) throws Exception {
        model.addAttribute("fornecedor", fornecedorDAO.buscar(id));
        return "excluirFornecedor";
    }

    @PostMapping("/excluir")
    public String excluir(@ModelAttribute Fornecedor fornecedor, RedirectAttributes redirectAttributes) {
        try {
            fornecedorDAO.excluir(fornecedor.getId());
            redirectAttributes.addFlashAttribute(NOME_VARIAVEL_MENSAGEM_SUCESSO, MENSAGEM_SUCESSO);
        } catch (Exception e) {
            redirectAttributes.addFlashAttribute(NOME_VARIAVEL_MENSAGEM_ERRO, MENSAGEM_ERRO);
            e.printStackTrace();
        }
        
        return "redirect:/fornecedores";
    }
}