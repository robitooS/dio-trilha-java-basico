# ☁️ Resumo Simples - Microsoft Azure

## ✅ O que é Azure?
Microsoft Azure é a plataforma de nuvem da Microsoft. Permite criar, hospedar e gerenciar aplicações e serviços em data centers espalhados pelo mundo.

---

## 🧱 Componentes Básicos

- **Resource Group**: Contêiner lógico para organizar recursos.
- **Subscription**: Plano de uso e cobrança.
- **Region**: Localização dos servidores.
- **Azure Portal**: Interface web para gerenciamento.
- **Azure CLI**: Linha de comando para automações.

---

## 🔧 Serviços Comuns

- **App Service**: Hospedagem de sites e APIs.
- **Azure Functions**: Código serverless.
- **Virtual Machines**: Máquinas virtuais Windows/Linux.
- **Azure SQL**: Banco de dados relacional.
- **Blob Storage**: Armazenamento de arquivos.

---

## 🛠️ Comandos Úteis (Azure CLI)

```bash
az login
az group create --name meuGrupo --location eastus
az vm create --name minhaVM --resource-group meuGrupo --image UbuntuLTS --admin-username azureuser --generate-ssh-keys
az webapp up --name meuApp --runtime "PYTHON:3.10" --resource-group meuGrupo
